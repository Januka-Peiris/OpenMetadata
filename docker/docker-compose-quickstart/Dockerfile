# Build stage
FROM alpine:3.19 AS build

# Copy the built artifact from your CI pipeline
COPY openmetadata-dist/*.tar.gz /tmp/

RUN mkdir -p /opt/openmetadata && \
    tar zxvf /tmp/*.tar.gz -C /opt/openmetadata --strip-components 1 && \
    rm /tmp/*.tar.gz

# Final stage
FROM alpine:3.19

ARG RI_VERSION="1.5.0-SNAPSHOT"
ARG BUILD_DATE
ARG COMMIT_ID

LABEL maintainer="OpenMetadata" \
      org.open-metadata.image.authors="support@openmetadata.org" \
      org.open-metadata.vendor="OpenMetadata" \
      org.open-metadata.release-version="$RI_VERSION" \
      org.open-metadata.description="OpenMetadata is an open source platform for metadata management and discovery." \
      org.open-metadata.url="https://open-metadata.org/" \
      org.open-metadata.vcs-url="https://github.com/open-metadata/OpenMetadata" \
      org.open-metadata.build-date=$BUILD_DATE \
      org.open-metadata.commit-id=$COMMIT_ID

EXPOSE 8585 8586

RUN adduser -D openmetadata && \
    apk update && \
    apk upgrade && \
    apk add --update --no-cache bash openjdk17-jre

COPY --chown=openmetadata:openmetadata --from=build /opt/openmetadata /opt/openmetadata
COPY --chmod=755 docker/openmetadata-start.sh ./

USER openmetadata
WORKDIR /opt/openmetadata

ENTRYPOINT ["/bin/bash"]
CMD ["/openmetadata-start.sh"]
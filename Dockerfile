FROM openjdk:8
COPY out/production/Practice/ /tmp/
WORKDIR /tmp
CMD java Main
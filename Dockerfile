FROM openjdk:1.8.0_321
COPY ./out/production/Practice/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]

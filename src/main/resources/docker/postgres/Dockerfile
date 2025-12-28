FROM postgres:16-alpine

#set environment variables
ENV POSTGRES_DB=banner_campaign_db
ENV POSTGRES_USER=martinv
ENV POSTGRES_PASSWORD=Password123@

WORKDIR /home/vagrant/app

COPY src/main/resources/docker/init-db.sh /docker-entrypoint-initdb.d/
RUN chmod +x /docker-entrypoint-initdb.d/init-db.sh

EXPOSE 5432
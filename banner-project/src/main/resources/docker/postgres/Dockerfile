FROM postgres:16-alpine

#set environment variables
ENV POSTGRES_DB=banner_campaign_db
ENV POSTGRES_USER=martinv
ENV POSTGRES_PASSWORD=Password123@

COPY app/banner-project/banner-project/src/main/resources/docker/init-db.sh app/init-db.sh
RUN chmod +x app/init-db.sh
RUN app/init-db.sh

EXPOSE 5432
FROM amazoncorretto:21
WORKDIR /app
COPY . /app
RUN javac fibonacci.java
CMD [ "java","fibonacci"]
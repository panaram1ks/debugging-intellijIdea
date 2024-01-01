#!/bin/bash

export CATALINA_HOME="/home/evgen/IdeaProjects/Tomcat/apache-tomcat-7.0.10"
export JAVA_HOME="/home/evgen/.jdks/corretto-1.8.0_352"
export PATH="$JAVA_HOME/bin:$PATH"

export JPDA_ADDRESS=8000
export JPDA_TRANSPORT=dt_socket

cd $CATALINA_HOME/bin

./catalina.sh jpda run
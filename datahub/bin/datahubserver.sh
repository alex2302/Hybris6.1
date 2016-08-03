#!/bin/bash
# resolve links - $0 may be a softlink
PRG="$0"
while [ -h "$PRG" ]; do
	ls=`ls -ld "$PRG"`
	link=`expr "$ls" : '.*-> \(.*\)$'`
	if expr "$link" : '/.*' > /dev/null; then
		PRG="$link"
	else
		PRG=`dirname "$PRG"`/"$link"
	fi
done
# Get standard environment
PRGDIR=`dirname "$PRG"`
# Explanation of settings:
# * Set the minimum memory to 2gb
# * Set the maximum memory to 4gb
# * Use the ParNew garbage collector for the young generation heap
# * Use the ConcurrentMarkSweep garbage collector for the old generation heap
# * Tell the JVM to touch all memory pages during JVM initialization
# * Disable explict garbage collection (i.e., via the System.gc() method)
export CATALINA_OPTS="-Xms2048m -Xmx4096m -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:+AlwaysPreTouch -XX:+DisableExplicitGC"
# Run Tomcat in the foreground
$PRGDIR/catalina.sh run
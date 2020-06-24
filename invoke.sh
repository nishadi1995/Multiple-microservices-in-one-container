#!/bin/bash

# turn on bash's job control
set -m

# Start the primary process and put it in the background
java -jar app.jar &

# Start the helper process
java -jar app2.jar

# bring the primary process back into the foreground
fg %1
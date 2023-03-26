#!/bin/bash

for run in {1..10}
do
echo "Today's date is $(date +'%H:%M:%S') and the number of processes is $(ps -ef | wc -l)"
#sleep 5
done

cat /proc/cpuinfo
cat /etc/os-release | head -1
cat /etc/os-release | head -1 | sed 's/NAME="//' | sed 's/Linux"//'

for run in {50..100}
do
touch $run.txt
done

echo "Well done, it works!"

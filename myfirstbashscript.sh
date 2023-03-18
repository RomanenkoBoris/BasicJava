#!/bin/bash
date
echo Hello $USER!
echo "Я работаю из следующей директории: "
pwd
echo "Общее количество процессов составляет:"
ps -ef | wc -l

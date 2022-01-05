#!/bin/bash
read -p "Enter a number: " n
if [ $n -gt -1 ];
then
echo "Number entered is a positive number";
else
echo "Number entered is a negative number";
fi

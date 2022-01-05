#!/bin/bash
read -p "Enter a number: " num
if [ $num -gt -1 ];
then
echo "Number entered is a positive number";
else
echo "Number entered is a negative number";
fi

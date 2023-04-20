#!/bin/bash

read -p "Enter the Number to find Cube upto " num
cube=1
for((i=1; i<=$num; i++))
do
	cube=`expr $i \* $i \* $i`
	echo "Number is "$i "and the cube of "$i " is "$cube
done


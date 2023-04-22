#!/bin/bash

read -p "Enter Number to print pattern" num
for ((i=1; i<=$num; i++))
do
	for((j=1; j<=$i; j++))
	do
		echo -n "$number "
    		number=`expr $number + 1`
	done
	echo
done

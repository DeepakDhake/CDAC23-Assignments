#!/bin/bash

read -p "Enter Number to print star pattern" num
for ((i=1; i<=$num; i++))
do
	for((j=1; j<=$i; j++))
	do
		echo -n "$i"
	done
	echo
done

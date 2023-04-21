#!/bin/bash

read -p "Enter Number to print star pattern" num
for ((i=0; i<=$num; i++))
do
	for((j=0; j<=$i; j++))
	do
		echo -n "*"
	done
	echo
done

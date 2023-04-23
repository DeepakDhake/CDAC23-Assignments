#!/bin/bash

read -p "Enter Number upto which you want even numbers " num
sum=0
for((i=2;i<=num * 2;i++))
do
	if((i % 2 == 0))
	then
		echo -n " "$i
		sum=$((sum + i)) 
	fi
done
echo " The sum of even natural numbers is "$sum


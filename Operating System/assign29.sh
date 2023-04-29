#!/bin/bash

read -p "Input a Number " num

temp1=$num
sum=0
while((num!=0))
do
	temp2=$((num % 10))
	mult=$((temp2 * temp2 * temp2))
	sum=$((mult + sum))
	num=$((num / 10)) 
done

if (($sum == temp1 ))
then
	echo $sum "is an Armstrong Number"
else
	echo $sum "is not an Armstrong Number"
fi

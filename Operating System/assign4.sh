#!/bin/bash

echo "Enter 10 Numbers"
sum=0
for ((i=0; i<10; i++))
do
	read -p "Enter Number " num
	sum=`expr $sum + $num`
	avg=`expr $sum / 10`
done
echo "Sum of 10 Number is "$sum
echo "Average of 10 Number is "$avg

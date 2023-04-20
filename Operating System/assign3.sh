#!/bin/bash

read -p "Enter " num
echo "The first "$num" natural numbers are "
for ((i=1; i<=$num; i++))
do
	 echo $i
done

echo "Sum of "$num" natural numbers is "
sum=0
for ((i=1; i<=$num; i++))
do
	 sum=`expr $sum + $i`
done

echo $sum

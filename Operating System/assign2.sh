#!/bin/bash

echo "Sum of first 10 natural numbers is"
sum=0
for ((i=1; i<=10; i++))
do
	 sum=`expr $sum + $i`
done

echo $sum

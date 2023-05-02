#!/bin/bash
echo "Enter Numbers Between 100 and 200 divisible by 9: "
sum=0
for ((i=101; i<200; i++))
do
	if (($i%9==0))
	then
		echo -n " "$i
		sum=`expr $sum + $i` 
	fi

done
	echo "The sum is: "$sum

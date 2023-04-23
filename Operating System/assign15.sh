#!/bin/bash

read -p "Enter the Number for which you want factorial " num

mult=1
for((i=1;i<=num;i++))
do
	mult=$((mult * i))
done
echo "Factorial = "$mult

#!/bin/bash
read -p "Input the value of x :" x
read -p "Input number of terms : " n
sum=1
no_row=1
for (( i=1; i<n; i++ ))
do
  no_row=$(bc -l <<< "$no_row*$x/$i")
  sum=$(bc -l <<< "$sum+$no_row")
done
printf "\nThe sum is: %f\n" "$sum"


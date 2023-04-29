#!/bin/bash
echo "Input the starting range or number : "
read mn

echo "Input the ending range of number : "
read mx

echo "The Perfect numbers within the given range : "
for ((n=$mn; n<=$mx; n++))
do
    i=1
    sum=0
    while [ $i -lt $n ]
    do
        if [ $(($n%$i)) -eq 0 ]
        then
           sum=$(($sum+$i))
        fi
        i=$(($i+1))
    done
    if [ $sum -eq $n ]
    then
      echo $n
    fi
done
echo


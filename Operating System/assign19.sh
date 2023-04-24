#!/bin/bash

i=1
s=0.0

echo -n "Input the number of terms : "
read n
echo ""

while [ $i -le $n ]
do
    if [ $i -lt $n ]
    then
        echo -n "1/$i + "
        s=$(echo "scale=5;$s + 1/$i" | bc)
    elif [ $i -eq $n ]
    then
        echo -n "1/$i"
        s=$(echo "scale=5;$s + 1/$i" | bc)
    fi
    i=$((i+1))
done

echo ""
echo "Sum of Series upto $n terms : $s"


#!/bin/bash
read -p "Input starting number of range: " stno
read -p "Input ending number of range: " enno
echo "The prime numbers between $stno and $enno are:"
for (( num=$stno; num<=$enno; num++ ))
do
    ctr=0
    for (( i=2; i<=$num/2; i++ ))
    do
        if [ $((num%i)) -eq 0 ]
        then
            ctr=$((ctr+1))
            break
        fi
    done
    if [ $ctr -eq 0 ] && [ $num -ne 1 ]
    then
        echo -n "$num "
    fi
done
echo ""


#!/bin/bash

read -p "Input number of rows: " n

for (( i=0; i<=n; i++ ))
do
    # print blank spaces
    for (( j=1; j<=n-i; j++ ))
    do
        echo -n " "
    done

    # display number in ascending order upto middle
    for (( j=1; j<=i; j++ ))
    do
        echo -n "$j"
    done

    # display number in reverse order after middle
    for (( j=i-1; j>=1; j-- ))
    do
        echo -n "$j"
    done

    echo ""
done


#!/bin/bash
read -p "Input number of rows: " no_row
for ((i=0;i<no_row;i++))
do
    for ((blk=1;blk<=no_row-i;blk++))
    do
        printf "  "
    done

    c=1

    for ((j=0;j<=i;j++))
    do
        if ((j==0 || i==0))
        then
            c=1
        else
            c=$((c*(i-j+1)/j))
        fi

        printf "% 4d" $c
    done

    printf "\n"
done


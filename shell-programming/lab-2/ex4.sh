# Greatest of three numbers

echo "Num-1 : "

read N1

echo "Num-2 : "

read N2

echo "Num-3 : "

read N3

if [ $N1 -gt $N2 -a $N1 -gt $N3 ]
then
	echo "$N1 is greatest among $N1, $N2, $N3"
elif [ $N2 -gt $N1 -a $N2 -gt $N3 ]
then
	echo "$N2 is greatest among $N1, $N2, $N3"
else
	echo "$N3 is greatest among $N1, $N2, $N3"
fi

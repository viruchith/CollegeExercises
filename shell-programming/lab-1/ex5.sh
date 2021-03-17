#Multiplication Table of a number upto 15

COUNT=1

echo "Enter Number :"

read NUM

echo "\n" #new line

while [ $COUNT -lt 16 ]

do
	
	MUL=`expr $NUM \* $COUNT`

	echo "$NUM x $COUNT = $MUL"

	COUNT=`expr $COUNT + 1`
done

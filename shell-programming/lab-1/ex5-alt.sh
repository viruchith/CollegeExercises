#Multiplication Table of a number upto 15

echo "Enter Number :"

read NUM

printf "\n" #new line

for i in {1..15} # 1 to 15 including 15

do
	
	MUL=`expr $NUM \* $i`

	echo "$NUM x $i = $MUL"
done

# CURRENT DATE
CURRENT_DATE=`date '+%Y-%m-%d'`
# ITERATE OVER FILES IN CURRENT DIR
for FILE in "`pwd`"/*

do
	# DELTE prefix path using `basename` command
	FILE="$(basename -- "$FILE")"
	# extract extension
	extension="${FILE##*.}"
	# extract filename without extension
	filename="${FILE%%.*}"
	#rename only txt files
	if [ $extension == 'txt' ]
	
	then
		`mv $FILE $CURRENT_DATE-$filename.txt`
	fi
done

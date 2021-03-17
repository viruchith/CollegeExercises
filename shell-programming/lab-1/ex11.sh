read P

if [ -d "$P" ]

then

	FILES_COUNT=` ls $P | wc -l`

	echo "$FILES_COUNT files are in the given directory."
else
	echo "$P is not a valid directory!"
fi

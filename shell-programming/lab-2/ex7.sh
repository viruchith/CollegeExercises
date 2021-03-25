# Greet the user based on time
  
USERNAME=`whoami`

HOUR=`date "+%H"`

if [ $HOUR -lt 12 ]
# 5:00 AM — 11:59 AM
then
        echo "Good Morning, $USERNAME."

elif [ $HOUR -lt 17 ]
#12:00 PM — 4:59 PM
then
        echo "Good Afternoon, $USERNAME."
#5:00 PM — 4:59 AM
else
        echo "Good Evening, $USERNAME."
fi



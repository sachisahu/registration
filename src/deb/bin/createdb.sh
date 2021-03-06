#!/usr/bin/env bash

echo This script must be run as a user that has access to Postgres


echo Creating registration database
createuser -D -P registration
createdb -O registration registration
psql registration -c "CREATE EXTENSION citext;"


echo Creating training database
createuser -D -P registrationtraining
createdb -O registrationtraining registrationtraining
psql registrationtraining -c "CREATE EXTENSION citext;"

exit

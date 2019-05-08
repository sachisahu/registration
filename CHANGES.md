# Change History

Version 0.6.0 (Pending)
- Added Till Detail Report after discussion w/ Treasury Dept. This report will be included with each
  closed till.
- Added Force Password Change page/interceptor. This included a database schema change, making it incompatible
  with the previous version.
- Log current user with every message
- Added preferred pronoun to Attendee class and database table (schema change)
- Changed Right at_con_registration_set_fan_name to at_con_registration_specialty and allow users with that right to
  save attendees with very little validation (names and birthdates not required for Speciality badges)
- Added separate template for creating attendees without validation. It is used automatically for users with the 
  above right.
- Don't allow check or card payments for greater than the amount due

Version 0.5 (4/9/2019)
- Initial "release" vgersion. Not ready for production yet, but start tracking changes
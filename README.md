bytefly-analytics-android
=========================

Library for ByteFly analytics.

Updates necessary...

1. we need a sample program that exercises track install

2. trackInstall should use shared prefs or some persistent storage so it doesn't 
call the network more than once. Rakesh... add class in util called Prefs.java

3. add a new feature that can track views so trackView to ByteFlyAnalytics class should
work with entrance and exit. extend NetworkSyncRequest to have more than one param.

4. add check for network availablity - mark morton




test
rakesh Test
bob another test
neal another test

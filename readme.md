# Project Domain/Description

The project domain that we have chosen is digital security and risk management. Our application will be a password manager which will include the ability to generate new secure passwords, securely save (encrypted) login data, as well as integrated 2FA (TOTP). The application will also include other risk management and security features such as the ability to generate ephemeral/temporary e-mail addresses, and checking if any of the user's passwords appear in breached/hacked databases. Some additional features we plan on adding (using various APIs we have found) to expand upon the scope of this project past its minimal viable product would be:
- URL & E-mail Fraud/Reputation Analysis
- Password quality scoring
- Password breach alerts/notifications
- Scanning files/URLs for any potential viruses, malware, or phishing links
- Threat Intelligence Feeds
- Potentially implement a system-level firewall with block-lists/filters
# API
One of the APIs we will be using for this project is the haveibeenpwned API. This is an API which will allow us to determine if any of the e-mails addresses or passwords stored in a user's password database have been found in any database breaches. The documentation for the API can be found [here](https://haveibeenpwned.com/API/v3).

Sample call of the API:
![Postman](https://i.imgur.com/TCAzvsi.png)

Example output of Java code:
![Java Code](https://i.imgur.com/Lu5JhAx.png)
# Potential Technical Problems
- Securely implementing encryption/decryption for our password manager using cryptography (Would need to find a Java library to help with this or learn how to do so from scratch)
- The list of APIs we plan on using may require subscriptions, and/or are limited to free versions which may lack the features we need (Would need to verify all of them and potentially cut down the project scope or purchase API keys)
- Although we have found an API that will help us implement 2FA (TOTP), we are not sure whether this will be possible using just the API
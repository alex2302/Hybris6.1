Recipe for a B2C Accelerator and a B2B Accelerator, both with CPQ enabled, running on the same platform. 
In order to create the B2B Accelerator, b2bacceleratoraddon and commerceorgaddon are installed on a yb2bacceleratorstorefront extension which is generated with extgen using the yacceleratorstorefront template.
The promotionengine is installed by default.
For features that require a Google API key (such as the Store Locator, which uses Google Maps), you need to set the “googleApiKey”. For information on generating your API Key: https://developers.google.com/maps/documentation/javascript/tutorial#api_key

Pre-Requirements:
Before you can use this recipe, you must install SAP CPQ Configuration Runtime Engine (also referred to as SSC) as described in the installation guide (especially sections 4.1, 4.2, and 4.3),
which you can find in the SAP Software Download Center at support.sap.com/swdc under Installations & Upgrades -> A-Z Alphabetical List of my Products. Under letter C you can find the installation guide
for SAP Configure, Price, and Quote for product configuration.
# Installation

## Java On Windows

1. Go to the Java download page at <https://www.oracle.com/java/technologies/javase-downloads.html>
2. Click the "Download" button for the latest version of Java.
3. Choose the appropriate installer for your operating system (e.g. Windows x64 if you have a 64-bit version of Windows).
4. Once the installer has finished downloading, double-click it to launch the installation wizard.
5. Follow the instructions in the wizard to complete the installation. Be sure to accept the license agreement and choose an appropriate installation location.

## Java Path Setup

1. After the installation is complete, open the Windows Start menu and search for "Environment Variables".
2. Click on "Edit the system environment variables" to open the System Properties window.
3. In the System Properties window, click on the "Environment Variables" button.
In the Environment Variables window, under the "System Variables" section, find the "Path" variable and click the "Edit" button.
4. In the "Edit environment variable" window, click the "New" button and add the path to the Java bin folder. By default, this folder is located at "C:\Program Files\Java\jdk[version]\bin" (replace [version] with the version of Java you installed).
5. Click "OK" to close all the windows.
6. Open the Command Prompt and type "java -version" to check if Java is installed correctly and the path is set up properly.

```cmd
java --version
```

# Build the APK without Android Studio

This project contains a GitHub Actions workflow that compiles the Android APK in the cloud.

## 1. Create a GitHub repository

Create a new repository on GitHub, for example:

`class10-revision-tracker`

A free repository is enough.

## 2. Upload this project's files

Upload the CONTENTS of this folder to the repository root.

The repository should contain:

- `.github/workflows/build-apk.yml`
- `app/`
- `build.gradle.kts`
- `settings.gradle.kts`
- `gradle.properties`

## 3. Wait for the build

After the upload, GitHub Actions will automatically run `Build APK`.

You can open:

`Actions` → `Build APK` → latest successful run.

## 4. Download the APK

At the bottom of the successful workflow run, download the artifact:

`revision-tracker-apk`

Inside it is:

`app-debug.apk`

Transfer that file to your Android phone and install it.

If Android asks, allow installation from the browser/file manager you used to open the APK.

## App behavior

- Progress is stored locally on the device.
- Mathematics starts with Real Numbers and Polynomials completed, matching the progress already recorded in the conversation.
- SST's Making of a Global World / Age of Industrialization alternative is one tracked slot.
- Periodic-test-only SST topics are visible but excluded from board completion.
- No external network connection is required by the app.
- Icons are inline SVG icons; there are no emoji UI controls.

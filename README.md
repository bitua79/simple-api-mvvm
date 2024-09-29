
# Simple API Request with MVVM Architecture
This repository provides a simple implementation of an API request using the MVVM (Model-View-ViewModel) architecture pattern. The MVVM pattern helps in separating concerns, making your code easier to maintain, test, and scale.

## Features
- **MVVM Architecture**: Clear separation of UI, business logic, and data handling.
- **API Integration**: Fetch data from a remote API.
- **Flow & ViewModel**: Used for observing data changes and updating the UI efficiently.
- **Repository Pattern**: Acts as a single source of truth for the ViewModel, fetching and storing data.

## Prerequisites
Before running the project, ensure you have the following:
- Android Studio installed
- Gradle version compatible with the project
- Internet connection for API requests

## Technologies Used
- **Kotlin**: For writing concise and robust code.
- **Retrofit**: For making network requests and handling API calls.
- **ViewModel & LiveData**: For lifecycle-aware UI components.
- **Coroutines**: For handling asynchronous API requests.

## Installation and Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/simple-api-mvvm.git
   ```
2. Open the project in Android Studio.
3. Sync Gradle and build the project.

## Usage
The repository provides a simple API request example:
1. **Model**: Defines the data structure used in the application.
2. **ViewModel**: Responsible for preparing data for the UI and handling business logic.
3. **Repository**: Responsible for data fetching from the API using Retrofit.
4. **UI (View)**: Observes data changes through LiveData and updates the user interface accordingly.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


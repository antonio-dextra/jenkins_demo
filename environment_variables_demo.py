import os


def get_environment_variable_list():
    environment_variable_list = os.environ.keys()
    return environment_variable_list


if __name__ == "__main__":
    print get_environment_variable_list()

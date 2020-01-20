import os


def get_environment_variable_list():
    environment_variable_list = os.environ.keys()
    return environment_variable_list

def get_key_value(key):
    value = os.environ.get(key=key)
    return value


if __name__ == "__main__":
    print get_environment_variable_list()
    print get_key_value('COMPUTERNAME')

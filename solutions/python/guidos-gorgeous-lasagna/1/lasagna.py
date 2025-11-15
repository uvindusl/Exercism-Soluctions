"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(minutes_in_oven):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - minutes_in_oven


def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time of the lasangya.

    :param number_of_layers: int - the number of layers added to the lasagna
    :return: int - preparation time (in minutes) multiply from 'PREPARATION_TIME'.

    Function that takes the number of layers in the lasagna an argument 
    and returns preparation time of the lasagnya based on 'PREPARATION_TIME'
    """

    
    return number_of_layers * PREPARATION_TIME

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed time.

    :param number_of_layers: int - the number of layers added to the lasagna
    :elapsed_bake_time: int - the number of minutes the lasagna has spent baking in the oven already
    :return: the elapsed time in minutes by calling 'preparation_time_in_minutes()' method and add the              elapsed_bake_time to it

    Function that takes the number of layers in the lasagna and elapsed bake time arguments 
    and returns elapsed time in minutes
    """

    
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time

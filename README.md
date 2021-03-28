# PlayerTracker
 PlayerTrackerPlugin [spigot - 1.16]



[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]


<!-- ABOUT THE PROJECT -->
## About The Project

![product-screenshot]

I have programmed the playertracker plugin for another person, but I am still allowed to publish the source code. 
This tracker has only 1 function, 1 command and 1 permission. It works without problems and will get updates often.
You are invited to use it. I would be delighted.



<!-- GETTING STARTED -->
## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.



### Installation

1. Build the plugin in your favourite development environment
2. Put the jar into your plugins folder



<!-- USAGE EXAMPLES -->
## Usage

The functions of the plugin are not very extensive.
There is the command `/track` with which you can switch the tracker on and off.
For this you need the permission `track.player`.
When the tracker is activated, it shows which player is closest to you and displays the exact distance in blocks.
In the configuration, you can change the colour of the bossbar and set the refresh rate of the bossbar.

### Commands

`/track`

### Permissions

`track.player`

### Configuration

  ```sh
#loadet
#auto generated configuration file

#bossbar color
#possible colors: red, purple, green, yellow, white, pink, blue
color: purple


#update-time
#in ticks (1sec = 20ticks)
ticks: 10
  ```
  
### Colors

![purple-bar]
![pink-bar]
![red-bar]
![yellow-bar]
![green-bar]
![blue-bar]
![white-bar]

<!-- ISSUES -->
## Issues

See the [open issues](https://github.com/Jak0busus/PlayerTracker/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch
3. Commit your Changes
4. Push to the Branch
5. Open a Pull Request



<!-- CONTACT -->
## Contact

Github: [@Jak0busus](https://github.com/Jak0busus)
Discord: [Jakob#2006](https://discord.com/users/580369300041498635)



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/Jak0busus/PlayerTracker.svg?style=for-the-badge
[contributors-url]: https://github.com/Jak0busus/PlayerTracker/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Jak0busus/PlayerTracker.svg?style=for-the-badge
[forks-url]: https://github.com/Jak0busus/PlayerTracker/network/members
[stars-shield]: https://img.shields.io/github/stars/Jak0busus/PlayerTracker.svg?style=for-the-badge
[stars-url]: https://github.com/Jak0busus/PlayerTracker/stargazers
[issues-shield]: https://img.shields.io/github/issues/Jak0busus/PlayerTracker.svg?style=for-the-badge
[issues-url]: https://github.com/Jak0busus/PlayerTracker/issues
[license-shield]: https://img.shields.io/github/license/Jak0busus/PlayerTracker.svg?style=for-the-badge
[license-url]: https://github.com/Jak0busus/PlayerTracker/blob/master/LICENSE
[product-screenshot]: images/gif-trackerreview.gif
[purple-bar]: images/image-purplebar.png
[pink-bar]: images/image-pinkbar.png
[red-bar]: images/image-redbar.png
[yellow-bar]: images/image-yellowbar.png
[green-bar]: images/image-greenbar.png
[blue-bar]: images/image-bluebar.png
[white-bar]: images/image-whitebar.png
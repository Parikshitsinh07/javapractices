<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>SidebarD</title>
    <link rel="stylesheet" href="Discounts.css" />
    <link
      rel="stylesheet"
      href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
    />
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.css"
      rel="stylesheet"
    />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.3.0/flowbite.min.js"></script>
  </head>
  <body>
    <aside id="sidebar-multi-level-sidebar">
      <div class="h-full px-3 py-4 overflow-y-auto bg-gray-50 dark:bg-gray-800">
        <ul class="space-y-2 font-medium">
          <li>
            <a
              href="#"
              class="flex items-center p-2 text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700 group"
            >
              <span class="flex-1 ms-3 whitespace-nowrap"
                ><h4>
                  <b style="color: rgb(71, 66, 66)">All Discounts%</b>
                </h4></span
              >
            </a>
          </li>
          <li>
            <a
              href="#"
              class="flex items-center p-2 text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700 group"
            >
              <span class="flex-1 ms-3 whitespace-nowrap"
                >Discounts up to
                <b style="color: rgb(252, 57, 57)">70%</b></span
              >
            </a>
          </li>
          <li>
            <a
              href="#"
              class="flex items-center p-2 text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700 group"
            >
              <span class="flex-1 ms-3 whitespace-nowrap"
                >Discounts up to
                <b style="color: rgb(109, 26, 26)">50%</b></span
              >
            </a>
          </li>
          <li>
            <a
              href="#"
              class="flex items-center p-2 text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700 group"
            >
              <span class="flex-1 ms-3 whitespace-nowrap"
                >Discounts up to <b style="color: rgb(34, 8, 8)">30%</b></span
              >
            </a>
          </li>
          <li>
            <button
              type="button"
              class="flex items-center w-full p-2 text-base text-gray-900 transition duration-75 rounded-lg group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
              aria-controls="dropdown-language"
              data-collapse-toggle="dropdown-language"
            >
              <span
                class="flex-1 ms-3 text-left rtl:text-right whitespace-nowrap"
                ><b>Language</b></span
              >
              <svg
                class="w-3 h-3"
                aria-hidden="true"
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 10 6"
              >
                <path
                  stroke="currentColor"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="m1 1 4 4 4-4"
                />
              </svg>
            </button>
            <ul id="dropdown-language" class="hidden py-2 space-y-2">
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;Hindi</a
                >
              </li>
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;English</a
                >
              </li>
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;Gujarati</a
                >
              </li>
            </ul>
          </li>
          <li>
            <button
              type="button"
              class="flex items-center w-full p-2 text-base text-gray-900 transition duration-75 rounded-lg group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
              aria-controls="dropdown-category"
              data-collapse-toggle="dropdown-category"
            >
              <span
                class="flex-1 ms-3 text-left rtl:text-right whitespace-nowrap"
                ><b>All Book category</b></span
              >
              <svg
                class="w-3 h-3"
                aria-hidden="true"
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 10 6"
              >
                <path
                  stroke="currentColor"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="m1 1 4 4 4-4"
                />
              </svg>
            </button>
            <ul id="dropdown-category" class="hidden py-2 space-y-2">
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;Horror Books</a
                >
              </li>
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;Comic Books</a
                >
              </li>
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;Novel Books</a
                >
              </li>
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;Pome Books</a
                >
              </li>
              <li>
                <a
                  href="#"
                  class="flex items-center w-full p-2 text-gray-900 transition duration-75 rounded-lg pl-11 group hover:bg-gray-100 dark:text-white dark:hover:bg-gray-700"
                  ><div class="checkbox-wrapper-12">
                    <div class="cbx">
                      <input type="checkbox" id="cbx-12" />
                      <label for="cbx-12"></label>
                      <svg
                        fill="none"
                        viewBox="0 0 15 14"
                        height="14"
                        width="15"
                      >
                        <path d="M2 8.36364L6.23077 12L13 2"></path>
                      </svg>
                    </div>

                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
                      <defs>
                        <filter id="goo-12">
                          <feGaussianBlur
                            result="blur"
                            stdDeviation="4"
                            in="SourceGraphic"
                          ></feGaussianBlur>
                          <feColorMatrix
                            result="goo-12"
                            values="1 0 0 0 0  0 1 0 0 0  0 0 1 0 0  0 0 0 22 -7"
                            mode="matrix"
                            in="blur"
                          ></feColorMatrix>
                          <feBlend in2="goo-12" in="SourceGraphic"></feBlend>
                        </filter>
                      </defs>
                    </svg>
                  </div>
                  &nbsp;Eductional Books</a
                >
              </li>
            </ul>
          </li>
        </ul>
      </div>
    </aside>
  </body>
</html>

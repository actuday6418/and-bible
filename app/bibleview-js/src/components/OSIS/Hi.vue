<!--
  - Copyright (c) 2020 Martin Denham, Tuomas Airaksinen and the And Bible contributors.
  -
  - This file is part of And Bible (http://github.com/AndBible/and-bible).
  -
  - And Bible is free software: you can redistribute it and/or modify it under the
  - terms of the GNU General Public License as published by the Free Software Foundation,
  - either version 3 of the License, or (at your option) any later version.
  -
  - And Bible is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
  - without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
  - See the GNU General Public License for more details.
  -
  - You should have received a copy of the GNU General Public License along with And Bible.
  - If not, see http://www.gnu.org/licenses/.
  -->

<template>
  <span :class="hiStyle"><slot/></span>
</template>

<script>
import {useCommon} from "@/composables";
import {computed} from "@vue/reactivity";

export default {
  name: "Hi",
  props: {
    type: {type: String, default: null},
    rend: {type: String, default: null},
  },
  setup(props) {
    const hiStyle = computed(() => {
      const classes = [];
      if(props.type) {
        classes.push(`hi-${props.type}`);
      }
      if(props.rend) {
        classes.push(`rend-${props.rend}`);
      }
      return classes;
    });
    return {hiStyle, ...useCommon()};
  },
}
</script>

<style scoped>
.hi-italic, .rend-italic {
  font-style: italic;
}
.hi-bold, .rend-italic {
  font-weight: bold;
}
.hi-super, .rend-super {
  vertical-align: super;
}
</style>

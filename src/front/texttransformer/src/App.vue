<template>
  <div id="app">
    <TextTransformer/>
  </div>
</template>

<script>
import TextTransformer from './components/TextTransformer.vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

export default {
  name: 'app',
  components: {
    TextTransformer
  }
}
</script>

<style>
body {
	background: url("https://images.unsplash.com/photo-1458040937381-49c067dfd49a?ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80")center fixed;
    background-size: cover;
}
.color-fill {
	background-color: rgba(222, 222, 222, 0.7);
	height: 100vh;
}
#app-transformer {
	padding: 5vh;
}
.btn-transform {
	width: 100%;
}
.data-div {
	background-color: rgb(244, 244, 244);
}
</style>

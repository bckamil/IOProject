<template>
  <div class="container color-fill">
    <div id="app-transformer">
      <input v-model="inputText" class="form-control" type="text" name="input" id="input" placeholder="Enter text" />
      <div class="pr-3 pl-3 pt-1 ml-4 mr-4 mt-2">
        <button v-on:click="addTransform('upper')" class="btn btn-primary btn-transform mb-1">Upper</button>
        <button v-on:click="addTransform('lower')" class="btn btn-primary btn-transform mb-1">Lower</button>
        <button v-on:click="addTransform('capital')" class="btn btn-primary btn-transform mb-1">Capital</button>
        <button v-on:click="addTransform('deldouble')" class="btn btn-primary btn-transform mb-1">Delete double</button>
        <button v-on:click="addTransform('inverse')" class="btn btn-primary btn-transform mb-1">Inverse</button>
        <button v-on:click="addTransform('fold')" class="btn btn-primary btn-transform mb-1">Fold</button>
        <button v-on:click="addTransform('unfold')" class="btn btn-primary btn-transform mb-1">Unfold</button>
        <button v-on:click="addTransform('number')" class="btn btn-primary btn-transform mb-1">Number</button>
        <button v-on:click="addTransform('latex')" class="btn btn-primary btn-transform mb-1">Latex</button>
        <button class="btn btn-transform btn-danger" v-on:click="deleteLastTransform">Delete last transform</button>
      </div>
      <div class="p-3 m-2 data-div">
        Transforms:
        <p id="transforms">{{ this.transforms }}</p>
      </div>
      <div class="p-3">
        <button class="btn btn-success btn-transform" v-on:click="doTransform">Transform</button>
      </div>
      <div class="p-3 data-div">
        Result:
        <p id="result-text">{{ this.outputText }}</p>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "HelloWorld",
  data() {
    return {
      transforms: ["upper"],
      inputText: null,
      outputText: null
    };
  },
  methods: {
    addTransform: function(transform) {
      this.transforms.push(transform);
    },
    deleteLastTransform: function() {
      if (this.transforms.length > 0) {
        this.transforms.pop();
      }
    },
    doTransform: function() {
      axios
        .post("http://127.0.0.1:8001/post/", {
          'text': this.inputText,
          'transforms': this.transforms
        })
        .then(response => this.outputText = response.data.text);
    }
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>

import React, {useState, useEffect} from 'react';
import axios from 'axios';

function QuoteComponent(){
    const fetchQuote = async()=>{
        try{
            const response = await axios.get("http://localhost:8080/api/quote");
        }catch(error){
            console.error("Error fetching quote:", error);
        }
    }
}

export default QuoteComponent;
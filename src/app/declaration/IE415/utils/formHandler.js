// formHandlers.js
import { submitForm } from "./formsubmit";
import { toast } from 'react-toastify';


// submit form to backend API if form is valid
export const onSubmit = async (data,reset) => {
    const requestData = {
        data: data,
        status: "validated",
    };

    console.log(requestData);
    const result = await submitForm(requestData);
    if (result.success) {
        console.log("Form submitted successfully");
        toast.success("Form submitted successfully");
        reset();
    } else {
        console.error("Form submission failed:", result.error);
        toast.error("Form submission failed");
    }
};

//submit form to backend API in draft mode
export const onSaveDraft = async (data, reset) => {
    const requestData = {
        data: data,
        status: "draft",
    };

    console.log(requestData);
    const result = await submitForm(requestData);
    if (result.success) {
        console.log("Draft saved successfully");
        toast.success("Draft saved successfully");
        reset();
    } else {
        console.error("Draft saving failed:", result.error);
        toast.error("Oops draft saving failed");
    }
};